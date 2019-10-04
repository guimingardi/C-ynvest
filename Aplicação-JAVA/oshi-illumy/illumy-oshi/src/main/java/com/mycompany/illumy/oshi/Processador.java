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
        var modeloProcessador = systemInfo.getHardware().getProcessor().toString();
        return modeloProcessador;
    }
    //FIM Informações do Hardware
    
    //Valores de atualização por tempo
    public String getUtilizacaoAtualProcessador(CentralProcessor processor) {
        var utilizacaoAtual = String.format("%.1f%%", systemInfo.getHardware().getProcessor().getSystemCpuLoad() * 100);
        return utilizacaoAtual;
    }

    public String getThreadsAtivos() {
        var threadsAtivos = systemInfo.getOperatingSystem().getThreadCount();
        return String.valueOf(threadsAtivos);
    }

    public String getTemperaturaCpu() {
        var temperaturaCpu = systemInfo.getHardware().getSensors().getCpuTemperature();
        return String.valueOf(temperaturaCpu);
    }
    //FIM Valores de atualização por tempo
}
