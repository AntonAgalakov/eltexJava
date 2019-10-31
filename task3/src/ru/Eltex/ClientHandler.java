package ru.Eltex;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
 
public class ClientHandler implements Runnable {
  private Server server;
  private String name;
  private PrintWriter out;
  private Scanner in;
  private Socket clientSocket = null;
 
  public ClientHandler(Socket socket, Server server) {
    try {
      this.server = server;
      this.clientSocket = socket;
      this.out = new PrintWriter(socket.getOutputStream());
      this.in = new Scanner(socket.getInputStream());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void run() {
    try { 
      clientPrint("You name: ");
      this.name = in.nextLine();
      
      while (true) {
        if (in.hasNext()) {
          String clientMessage = in.nextLine();
          
          if (clientMessage.equals("exit"))
            break;
          
          System.out.println(this.name + ": " + clientMessage);
          server.sendMessage(this.name, clientMessage, this);
        }
       Thread.sleep(100);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      System.out.println(this.name + " has logged out");
      server.sendMessage(this.name, "has logged out", this);
      this.close();
      clientPrint("You are out");
    }

  }
  public void sendMsg(String name, String msg) {
    try {
      out.println(name + ": " + msg);
      out.flush();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void clientPrint(String str) {
    out.print(str);
    out.flush();
  }

  public void close() {
    server.deleteClient(this);
  }
}
