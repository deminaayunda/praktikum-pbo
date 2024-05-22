/*
 *	Nama File   : MainDAO.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 22-05-2024
 *	Deskripsi   : class MainDAO
 */

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}