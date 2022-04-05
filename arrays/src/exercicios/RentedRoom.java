package exercicios;

public class RentedRoom {
    private String nome;
    private String email;
    private int roomId;

    public RentedRoom(String nome, String email, int roomId) {
        this.nome = nome;
        this.email = email;
        this.roomId = roomId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString(){
           return String.format("%d: %s, %s",
                getRoomId(), getNome(), getEmail());
    }

}
