package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private Long idMessage;
    private User sender;
    private List<User> receivers = null;
    private String text;

}
