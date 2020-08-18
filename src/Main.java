class App extends JPanel {
        
    Stage stage;

    public App() {
        setPreferredSize(new Dimension(720, 720));
        stage = new Stage();
    }

    @Override
    public void paint(Graphics g) {
        stage.paint(g, getMousePosition());
    }

}