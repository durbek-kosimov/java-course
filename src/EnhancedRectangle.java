public class EnhancedRectangle {
    int top, left, width, height;

    public EnhancedRectangle (int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public EnhansedRectangle (int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public EnhansedRectangle (int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public EnhansedRectangle (EnhansedRectangle enhansedRectangle) {
        this.top = top;
        this.left = left;

    }


    public static void main(String[] args) {

    }
}
