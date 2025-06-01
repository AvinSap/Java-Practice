public class MediaPlayer implements MediaController{
    @Override
    public void play() {
        System.out.println("Player plays");
    }

    @Override
    public void pause() {
        System.out.println("Player Paused");
    }

    @Override
    public void stop() {
        System.out.println("Player Stopped");
    }

    @Override
    public void increase(int value) {
        System.out.println("Volume level increased by: "+ value);
    }

    @Override
    public void decrease(int value) {
        System.out.println("Volume level decreased by: "+ value);
    }
}
