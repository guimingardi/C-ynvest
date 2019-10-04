package com.mycompany.illumy.oshi;

import oshi.SystemInfo;
import oshi.software.os.OperatingSystem;

public class SistemaOperacional {
    private final SystemInfo systemInfo;
    private final OperatingSystem sistemaOperacional;

    public SistemaOperacional() {
        systemInfo = new SystemInfo();
        sistemaOperacional = systemInfo.getOperatingSystem();
    }
    
    //Informações do Sistema Operacional e usuário
    public String getModeloSO(){
        var modeloSO = sistemaOperacional.getFamily();
        return modeloSO;
    }
    public String getFabricante(){
        var fabricante = sistemaOperacional.getManufacturer();
        return fabricante;
    }
    
    public String getHostname(){
        var hostname = sistemaOperacional.getNetworkParams().getHostName();
        return hostname;
    }
    
    public String getUsername(){
        var username = sistemaOperacional.getProcess(0).getUser();
        return username;
    }
    //FIM Informações do Sistema Operacional e usuário
}
