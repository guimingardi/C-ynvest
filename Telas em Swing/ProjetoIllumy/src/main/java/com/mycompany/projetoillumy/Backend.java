package com.mycompany.projetoillumy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backend {
    
    public static void main(String[] args) throws IOException {
        //String command = "powershell.exe  your command";
  //Getting the version
  String command = "powershell.exe  echo 'Ola Mundo'";
  // Executing the command
  Process powerShellProcess = Runtime.getRuntime().exec(command);
  // Getting the results
  powerShellProcess.getOutputStream().close();
  String line;
  System.out.println("Standard Output:");
        try (BufferedReader stdout = new BufferedReader(new InputStreamReader(
                powerShellProcess.getInputStream()))) {
            while ((line = stdout.readLine()) != null) {
                System.out.println(line);
            }     }
  System.out.println("Standard Error:");
        try (BufferedReader stderr = new BufferedReader(new InputStreamReader(
                powerShellProcess.getErrorStream()))) {
            while ((line = stderr.readLine()) != null) {
                System.out.println(line);
            }     }
  System.out.println("Done");
    }
    
}

