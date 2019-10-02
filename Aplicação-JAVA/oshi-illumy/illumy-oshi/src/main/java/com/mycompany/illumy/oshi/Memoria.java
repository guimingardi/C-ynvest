package com.mycompany.illumy.oshi;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import oshi.util.FormatUtil;

public class Memoria {

    private final SystemInfo systemInfo;
    private final OperatingSystem operatingSystem;
    private final HardwareAbstractionLayer hardware;

    public Memoria() {
        systemInfo = new SystemInfo();
        operatingSystem = systemInfo.getOperatingSystem();
        hardware = systemInfo.getHardware();
    }

    public String recebeMemoriaDisponivel(GlobalMemory memoria) {
        var memoriaDisponivel = memoria.getAvailable();
        return FormatUtil.formatBytes(memoriaDisponivel);
    }

    public String recebeMemoriaTotal(GlobalMemory memoria) {
        var memoriaTotal = memoria.getTotal();
        return FormatUtil.formatBytes(memoriaTotal);
    }
    
}
