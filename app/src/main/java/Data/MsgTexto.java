package Data;


public class MsgTexto {

    private String IdMessage;
    private String Message;
    private int TypeMessage;
    private String HoraMessage;

    public MsgTexto() {
    }

    public String getIdMessage() {
        return IdMessage;
    }

    public void setIdMessage(String idMessage) {
        IdMessage = idMessage;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public int getTypeMessage() {
        return TypeMessage;
    }

    public void setTypeMessage(int typeMessage) {
        TypeMessage = typeMessage;
    }

    public String getHoraMessage() {
        return HoraMessage;
    }

    public void setHoraMessage(String horaMessage) {
        HoraMessage = horaMessage;
    }
}
