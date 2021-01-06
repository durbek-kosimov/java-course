public enum Keys {
    b(98), d(100), Escape(27);

    private int keyCode;

    private Keys(int keyCode) {
        this.keyCode = keyCode;
    }

    public int getKeyCode() {
        return keyCode;
    }
}
