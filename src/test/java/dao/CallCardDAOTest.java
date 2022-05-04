/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.Book;
import models.BookCopy;
import models.BorrowingTurn;
import models.CallCard;
import models.CallCardDetail;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HieuTT
 */
public class CallCardDAOTest {
    
    public CallCardDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of generateCallCardId method, of class CallCardDAO.
     */
//    @Test
//    public void testGenerateCallCardId() throws Exception {
//        System.out.println("generateCallCardId");
//        CallCardDAO instance = new CallCardDAO();
//        int expResult = 0;
//        int result = instance.generateCallCardId();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }

    /**
     * Test of submit method, of class CallCardDAO.
     */
    @Test
    public void testSubmit() throws Exception {
        System.out.println("submit");
        CallCard callcard = null;
        List<BookCopy> addedBooks = null;
        CallCardDAO instance = new CallCardDAO();
        boolean result= instance.submit(callcard, addedBooks);
        // TODO review the generated test code and remove the default call to fail.
        
        CallCard callCard = new CallCard(24, "2022-05-04", "2022-05-11", 4, 3);
        
        
        
        Book book = new Book(6, "Dac Nhan Tam");
        
        BookCopy bookCopy = new BookCopy(5, book);
        
        addedBooks.add(bookCopy);
        
        assertEquals(true, result);
        
    }
    
//     @Test
//    public void testSubmit1() throws Exception {
//        System.out.println("submit");
//        CallCard callcard = null;
//        List<BookCopy> addedBooks = null;
//        CallCardDAO instance = new CallCardDAO();
//        instance.submit(callcard, addedBooks);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }

    /**
     * Test of getBorrowList method, of class CallCardDAO.
     */
    @Test
    public void testGetBorrowList() throws Exception {
        System.out.println("getBorrowList");
        String startDate = "2022-01-01";
        String endDate = "2022-05-04";
        int bookId = 1;
        CallCardDAO instance = new CallCardDAO();
       
        List<BorrowingTurn> result = instance.getBorrowList(startDate, endDate, bookId);
        assertEquals("Lap Trinh C", result.get(0).getTitle());
        assertEquals(12, result.get(0).getBookcopyId());
        assertEquals("2022-03-08", result.get(0).getborrowingDate());
        assertEquals("2022-03-15", result.get(0).getdueDate());
        assertEquals(1, result.get(0).getCallcardId());
        
        
        assertEquals("Lap Trinh C", result.get(1).getTitle());
        assertEquals(14, result.get(1).getBookcopyId());
        assertEquals("2022-04-05", result.get(1).getborrowingDate());
        assertEquals("2022-10-05", result.get(1).getdueDate());
        assertEquals(11, result.get(1).getCallcardId());
        
        assertEquals("Lap Trinh C", result.get(2).getTitle());
        assertEquals(15, result.get(2).getBookcopyId());
        assertEquals("2022-03-08", result.get(2).getborrowingDate());
        assertEquals("2022-03-15", result.get(2).getdueDate());
        assertEquals(2, result.get(2).getCallcardId());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    
        @Test
    public void testGetBorrowList1() throws Exception {
        System.out.println("getBorrowList");
        String startDate = "2022-01-01";
        String endDate = "2022-02-28";
        int bookId = 1;
        CallCardDAO instance = new CallCardDAO();
        List<BorrowingTurn> expResult = null;
        List<BorrowingTurn> result = instance.getBorrowList(startDate, endDate, bookId);
        assertTrue(result.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /**
     * Test of getCallCardDetail method, of class CallCardDAO.
     */
//    @Test
//    public void testGetCallCardDetail() throws Exception {
//        System.out.println("getCallCardDetail");
//        int callcardId = 0;
//        CallCardDAO instance = new CallCardDAO();
//        CallCardDetail expResult = null;
//        CallCardDetail result = instance.getCallCardDetail(callcardId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
    
}
