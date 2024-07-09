public class DownloadThread extends Thread{
    private String fileUrl;

    public DownloadThread(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 100; i++) {
            System.out.println("Downloaded: " + fileUrl + " " + i + "%");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
