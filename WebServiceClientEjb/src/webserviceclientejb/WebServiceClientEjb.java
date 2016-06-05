/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package webserviceclientejb;

import com.edulibrary.webservice.Books;

/**
 *
 * @author ulrich
 */
public class WebServiceClientEjb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(Books book:getBooks()){
        System.out.println(book.getName());
}
    }

    private static java.util.List<com.edulibrary.webservice.Books> getBooks() {
        com.edulibrary.webservice.LibraryService service = new com.edulibrary.webservice.LibraryService();
        com.edulibrary.webservice.LibraryBooksWebserviceBean port = service.getLibraryBooksWebserviceBeanPort();
        return port.getBooks();
    }
    
}
