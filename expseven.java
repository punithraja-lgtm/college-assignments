interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}


class Rectangle implements Resizable {
    private int width;
    private int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }


    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    public void display() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}
class Square implements Resizable {
    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }
      @Override
    public void resizeHeight(int width) {
        this.width = width;
    }

    public void display() {
        System.out.println("Width: " + width);
    }

}
public class expseven {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        rect.display();
        Square square = new Square(15);
        square.display();

        rect.resizeWidth(30);
        rect.resizeHeight(40);
        square.resizeWidth(25);
        rect.display();
        square.display();
    }
}