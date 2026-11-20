// TODO: Crie a classe SmartTV que implementa Powerable e VolumeControl

class SmartTV implements Powerable, VolumeControl {
    // TODO: Declare os campos:
    // - brand (String)
    // - isOn (boolean, inicialmente false)
    // - volume (int, inicialmente 0)
    private String brand;
    private boolean isOn = false;
    private int volume = 0;
    
    // TODO: Crie um construtor que recebe o nome da marca
    public SmartTV(String brand) {
        this.brand = brand;
    }
    
    // TODO: Implemente powerOn() - defina isOn como true e imprima: [brand] TV is now ON
    public void powerOn() {
        this.isOn = true;
        System.out.println(this.brand + " TV is now ON");
    }
    
    // TODO: Implemente powerOff() - defina isOn como false e imprima: [brand] TV is now OFF
    public void powerOff() {
        this.isOn = false;
        System.out.println(this.brand + " TV is now OFF");
    }
    
    // TODO: Implement setVolume(int level) - update volume and print: [brand] TV volume set to [level]
    public void setVolume(int level) {
        this.volume = level;
        System.out.println(this.brand + " TV volume set to " + this.volume);
    }
    
    // TODO: Implement getVolume() - return the current volume
    public int getVolume() {
        return this.volume;
    }
}
