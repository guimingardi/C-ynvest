package com.mycompany.illumy.oshi;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

public class Processador {

    private final SystemInfo systemInfo;
    private final HardwareAbstractionLayer hardware;

    public Processador() {
        systemInfo = new SystemInfo();
        hardware = systemInfo.getHardware();
    }
    
    //Valores de atualização por tempo
    public String getUtilizacaoAtualProcessador(CentralProcessor processor) {
        return String.format("%.1f%%", hardware.getProcessor().getSystemCpuLoad() * 100);
    }

    public String getThreadsAtivos() {
        return String.valueOf(systemInfo.getOperatingSystem().getThreadCount());
    }

    public String getTemperaturaCpu() {
        return String.valueOf(hardware.getSensors().getCpuTemperature());
    }
    //FIM Valores de atualização por tempo
}
