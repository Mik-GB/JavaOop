package Lectures2.HW;

public class Wall {
    public Wall() {
    }

    public Integer getHeight() {
        return Height;
    }

    protected Integer Height;

    public Wall(Integer height) {
        Height = height;
    }

    protected void jump(int height){
        if (height <= Height){
            System.out.println();
        }
    }
}
