package com.solid.corrected;

/**
 * SOLUCIÓN LSP: Solo implementa Downloadable, no fuerza métodos de envío
 */
public class DigitalProduct extends Product implements Downloadable {
    private String downloadUrl;
    private long fileSize;

    public DigitalProduct(String name, double basePrice) {
        super(name, basePrice);
        this.downloadUrl = "https://download.example.com/" + 
                          name.toLowerCase().replace(" ", "-").replace("ñ", "n");
        this.fileSize = 1024 * 1024;
    }

    public DigitalProduct(String name, double basePrice, String downloadUrl, long fileSize) {
        super(name, basePrice);
        this.downloadUrl = downloadUrl;
        this.fileSize = fileSize;
    }

    @Override
    public double calculatePrice() {
        return basePrice;
    }

    @Override
    public String getDownloadUrl() {
        return downloadUrl;
    }

    @Override
    public long getFileSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", 
            ", downloadUrl='" + downloadUrl + "', fileSize=" + getFormattedFileSize() + "}");
    }
}
