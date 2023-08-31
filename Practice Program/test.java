// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Properties;
// // import javax.mail.Flags;
// // import javax.mail.Folder;
// // import javax.mail.Message;
// // import javax.mail.MessagingException;
// // import javax.mail.NoSuchProviderException;
// // import javax.mail.Session;
// // import javax.mail.Store;
// // public class NewTest {
// // public static void deletemail(String hst, String stype, String emailuser,
// // String passwd)
// {
// try
// {
// Properties props = new Properties();
// props.put("mail.store.protocol", "pop3");
// props.put("mail.pop3s.host", hst);
// props.put("mail.pop3s.port", "995");
// props.put("mail.pop3.starttls.enable", "true");
// Session sess = Session.getDefaultInstance(props);
// Store st = sess.getStore("pop3s");
// st.connect(hst, emailuser, passwd);
// Folder fld = st.getFolder("INBOX");
// fld.open(Folder.READ_WRITE);
// BufferedReader rd = new BufferedReader(new InputStreamReader(
// System.in));
// Message[] msgs = fld.getMessages();
// System.out.println("msgs.length---" + msgs.length);
// for (int i = 0; i < msgs.length; i++) {
// Message ms = msgs[i];
// System.out.println("---------------------------------");
// System.out.println("Email Number " + (i + 1));
// System.out.println("Email Subject: " + ms.getSubject());
// System.out.println("From: " + ms.getFrom()[0]);
// String sub = ms.getSubject();
// System.out.print("Do you want to delete this message [y/n] ? ");
// String res = rd.readLine();
// if ("Y".equals(res) || "y".equals(res)) {
// ms.setFlag(Flags.Flag.DELETED, true);
// System.out.println("Marked DELETE for message: " + sub);
// } else if ("n".equals(res)) {
// break;
// }
// }
// fld.close(true);
// st.close();
// } catch (NoSuchProviderException e) {
// e.printStackTrace();
// } catch (MessagingException e) {
// e.printStackTrace();
// } catch (IOException io) {
// io.printStackTrace();
// }
// }
// public static void main(String[] args) {
// String gmailhost = "pop.gmail.com";
// String mailStoreType = "pop3";
// String username = "ramansiva57@gmail.com";
// String password = "xodbizaoiqijifre";
// deletemail(gmailhost, mailStoreType, username, password);
// }
// }