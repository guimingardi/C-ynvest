package com.mycompany.illumy.oshi;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.util.FormatUtil;

public class Memoria {

    private final SystemInfo systemInfo;

    public Memoria() {
        systemInfo = new SystemInfo();
    }

    //Valores de atualização por tempo
    public String getMemoriaDisponivel(GlobalMemory memoria) {
        var memoriaDisponivel = memoria.getAvailable();
        return FormatUtil.formatBytes(memoriaDisponivel);
    }

    public String getMemoriaTotal(GlobalMemory memoria) {
        var memoriaTotal = memoria.getTotal();
        return FormatUtil.formatBytes(memoriaTotal);
    }
    //FIM //Valores de atualização por tempo
}
