package com.mycompany.illumy.oshi;

import oshi.software.os.FileSystem;
import oshi.software.os.OSFileStore;
import oshi.util.FormatUtil;

public class Armazenamento {

    private final OSFileStore[] fsArray;
    private long disponivel;
    private long total;

    public Armazenamento(FileSystem fileSystem) {
        fsArray = fileSystem.getFileStores();
        disponivel = 0;
        total = 0;
    }

    public String getDiscoDisponivel() {
        for (OSFileStore fs : fsArray) {
            disponivel += fs.getUsableSpace();
        }
        return FormatUtil.formatBytes(disponivel);
    }

    public String getDiscoTotal() {
        for (OSFileStore fs : fsArray) {
            total += fs.getTotalSpace();
        }
        return FormatUtil.formatBytes(total);
    }

}
