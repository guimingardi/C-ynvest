package com.mycompany.illumy.oshi;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

public class Processador {

    private final SystemInfo systemInfo;

    public Processador() {
        systemInfo = new SystemInfo();
    }
    
    
    //Informações do Hardware
    public String getModeloProcessador(){
        return systemInfo.getHardware().getProcessor().toString();
    }
    //FIM Informações do Hardware
    
    //Valores de atualização por tempo
    public String getUtilizacaoAtualProcessador(CentralProcessor processor) {
        return String.format("%.1f%%", systemInfo.getHardware().getProcessor().getSystemCpuLoad() * 100);
    }

    public String getThreadsAtivos() {
        return String.valueOf(systemInfo.getOperatingSystem().getThreadCount());
    }

    public String getTemperaturaCpu() {
        return String.valueOf(systemInfo.getHardware().getSensors().getCpuTemperature());
    }
    //FIM Valores de atualização por tempo
}
