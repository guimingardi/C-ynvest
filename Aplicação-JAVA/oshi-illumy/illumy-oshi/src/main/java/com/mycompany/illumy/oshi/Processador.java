package com.mycompany.illumy.oshi;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

public class Processador {

    private final SystemInfo systemInfo;

    public Processador() {
        systemInfo = new SystemInfo();
    }

    public String utilizacaoAtualProcessador(CentralProcessor processor) {
        var utilizacaoAtual = String.format("%.1f%%", systemInfo.getHardware().getProcessor().getSystemCpuLoad() * 100);
        return utilizacaoAtual;
    }
}
