public class B implements AutoCloseable{


    @Override
    public void close() throws Exception {
        System.out.println("Closed");
    }
}
