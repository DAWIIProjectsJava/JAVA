/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author 100005978.joan23
 */
public class Storage_MediasTotal {
    private String name_user;
    private double Med_curso;

    public Storage_MediasTotal() {
    }

    public Storage_MediasTotal(String name_user, double Med_curso) {
        this.name_user = name_user;
        this.Med_curso = Med_curso;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public double getMed_curso() {
        return Med_curso;
    }

    public void setMed_curso(double Med_curso) {
        this.Med_curso = Med_curso;
    }
    
    
}

