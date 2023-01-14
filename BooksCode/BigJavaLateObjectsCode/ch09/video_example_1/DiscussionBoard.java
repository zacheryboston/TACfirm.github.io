import java.util.ArrayList;
import java.util.Scanner;

/**
   A simulated discussion board.
*/
public class DiscussionBoard
{
   private ArrayList<User> users;
   private ArrayList<Message> messages;
   private User currentUser;
   private Message currentMessage;
   private Scanner in;

   public static void main(String[] args)
   {
      new DiscussionBoard().run();
   }

   /**
      Constructs the discussion board.
   */
   public DiscussionBoard()
   {
      in = new Scanner(System.in);
      users = new ArrayList<User>();
      messages = new ArrayList<Message>();
      User admin = new Instructor("admin", "secret");
      users.add(admin);
      Message welcome = new Message(admin, "Welcome", 
         "Welcome to the discussion board!\n");
      messages.add(welcome);
   }

   /**
      Runs the simulation.
   */
   public void run()
   {
      while (true)
      {
         if (currentUser == null)
         {
            login();
         }
         else
         {
            String userMenu = currentUser.getMenu(); 
            System.out.print("\n" + userMenu + "Command: ");
            String command = in.nextLine().toUpperCase();
            if (userMenu.contains(command + ")"))
            {
               if (command.equals("S")) { showMessages(); }
               else if (command.equals("N")) { newMessage(); }
               else if (command.equals("R")) { replyToMessage(); }
               else if (command.equals("L")) { logout(); }
               else if (command.equals("P")) { purgeMessage(); }
               else if (command.equals("A")) { addUser(); }
            }
         }
      }
   }

   /**
      Finds a user with a given name.
      @param username the name to search
      @return the matching user, or null if none found
   */
   public User findUser(String username)
   {
      boolean found = false;
      for (int i = 0; !found && i < users.size(); i++)
      {
         User current = users.get(i);
         if (current.getName().equals(username)) { return current; }
      }
      return null;
   }
   
   /**
      Executes the login command.
   */
   public void login()
   {
      System.out.print("User name: ");
      String username = in.nextLine();
      System.out.print("Password: ");
      String password = in.nextLine();
      User found = findUser(username);
      if (found != null && found.authenticate(password)) 
      {
         currentUser = found;
      }
      else
      {
         System.out.println("Authentication failed");
      }
   }

   /**
      Executes the add user command.
   */
   public void addUser()
   {
      System.out.print("User name: ");
      String username = in.nextLine();
      System.out.print("Password: ");
      String password = in.nextLine();
      if (findUser(username) == null) 
      {         
         users.add(new User(username, password));
      }
      else
      {
         System.out.println("User already exists");
      }
   }

   /**
      Executes the logout command.
   */
   public void logout()
   {
      currentUser = null;
   }

   /**
      Shows all message titles and lets the user pick one for display.
   */
   public void showMessages()
   {
      for (int i = 0; i < messages.size(); i++)
      {
         Message msg = messages.get(i);
         if (msg == currentMessage) System.out.print("*");
         System.out.println((i + 1) + ") " + msg.getTitle());
      }
      System.out.print("Message number: ");
      int number = in.nextInt(); in.nextLine(); 
      currentMessage = messages.get(number - 1);
      currentMessage.display();
   }

   /**
      Executes the new message command.
   */
   public void newMessage()
   {
      System.out.print("Title: ");
      String title = in.nextLine();
      String text = "";
      System.out.println("Enter text, Q when done");
      boolean done = false;
      while (!done)
      {
         String line = in.nextLine();
         if (line.toUpperCase().equals("Q")) { done = true; }
         else { text = text + line + "\n"; }
      }
      currentMessage = new Message(currentUser, title, text);
      messages.add(currentMessage);
   }
   
   /**
      Executes the reply to message command.
   */
   public void replyToMessage()
   {
      String text = "";
      System.out.println("Enter reply, Q when done");
      boolean done = false;
      while (!done)
      {
         String line = in.nextLine();
         if (line.toUpperCase().equals("Q")) { done = true; }
         else { text = text + line + "\n"; }
      }
      currentMessage = new Response(currentUser, currentMessage, text);
      messages.add(currentMessage);
   }

   /**
      Executes the purge message command.
   */
   public void purgeMessage()
   {
      messages.remove(currentMessage);
   }
}
