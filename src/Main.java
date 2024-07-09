public class Main {
    public static void main(String[] args) {

        DownloadThread dt1 = new DownloadThread("https://bitcode.in/file1");
        //dt1.run();
        dt1.start();

        DownloadThread dt2 = new DownloadThread("https://java.in/file2");
        //dt2.run();
        dt2.start();

        for(int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Main Thread");
        }

    }
}
