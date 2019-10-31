package ru.Eltex;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
 
public class Server {
  static final int PORT = 8080;
  private ArrayList<ClientHandler> clients = new ArrayList<ClientHandler>();
 
  public Server() {
    Socket clientSocket = null;
    ServerSocket serverSocket = null;
    try {
      serverSocket = new ServerSocket(PORT);
      while (true) {
        clientSocket = serverSocket.accept();
        ClientHandler client = new ClientHandler(clientSocket, this);
        clients.add(client);
        new Thread(client).start();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        clientSocket.close();
        serverSocket.close();
        System.out.println("STOP");
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

         
  public void sendMessage(String name, String msg, ClientHandler autor) {
    for (ClientHandler i : clients)
      if (i != autor)
        i.sendMsg(name,msg);
  }

  public void deleteClient(ClientHandler client) {
    clients.remove(client);
  }
}