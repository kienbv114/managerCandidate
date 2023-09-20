/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Fresher extends Candidate{
    private String graduationRank;
    private String graduationeDate ;
    public Fresher() {
        super() ;
    }
    public Fresher(String graduationeRank,String graduationDate,
            String id, String firstName, String lastName, int birthDate,
            String address, String phone, String email, int typeCandidate) {
        super(id, firstName, lastName, birthDate, address, phone, email, typeCandidate) ;
        this.graduationRank = graduationRank ;
        this.graduationeDate = graduationDate ;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String GraduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getGraduationeDate() {
        return graduationeDate;
    }

    public void setGraduationeDate(String GraduationeDate) {
        this.graduationeDate = graduationeDate;
    }
}
