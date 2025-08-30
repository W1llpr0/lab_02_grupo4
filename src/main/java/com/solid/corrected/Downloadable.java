package com.solid.corrected;

/**
 * PRINCIPIO ISP: Responsabilidades específicas para productos digitales
 */
public interface Downloadable {

    String getDownloadUrl();

    long getFileSize();

    default String getFormattedFileSize() {
        long bytes = getFileSize();
        if (bytes < 1024) return bytes + " B";
        if (bytes < 1024 * 1024) return String.format("%.1f KB", bytes / 1024.0);
        if (bytes < 1024 * 1024 * 1024) return String.format("%.1f MB", bytes / (1024.0 * 1024.0));
        return String.format("%.1f GB", bytes / (1024.0 * 1024.0 * 1024.0));
    }
}
