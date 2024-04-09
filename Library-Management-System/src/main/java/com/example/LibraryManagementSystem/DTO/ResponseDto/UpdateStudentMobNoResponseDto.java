package com.example.LibraryManagementSystem.DTO.ResponseDto;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateStudentMobNoResponseDto {

    private int id;

    private String mobNo;

    public void setName(String name) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}
