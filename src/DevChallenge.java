/**
 * 
 * @author Ahmed Mokhtar
 * 
 *
 */
public class DevChallenge {
    // Original text reference
    static String reference = "í`1234567890-=~!@#$%^&*()_+qwertyuiop[]QWERTYUIOP{}|asdfghjkl;'ASDFGHJKL:zxcvbnm,./ZXCVBNM<>?01234 56789/*ë\n";
    static String[] referenceArray = reference.split("(?<=\\G.{1})");
    // Encrypted text reference
    static String refEncrypted = "C74A1B18191E1F1C1D12131A0717540B6A090E0F740C00020375015B5D4F585E535F43455A71777B7D6F787E737F63657A5157564B594E4C4D42404146110D6B796E6C6D62606166105052495C4844470604057072697C6864671614151A1B18191E0A1F1C1D12130500C127";
    static String[] refEncryptArray = refEncrypted.split("(?<=\\G.{2})");

    public static void main(String[] args) {
	// Given Message to decrypt
	String message = "6B0A6F46484F584F5E420A6D43465E42454443C1462720594346435C584F440A5A4F44444B0A47C75843C1462720450A474F444F460A4B4D464B580A4F464F444B5E420B2720644B0749424B4F584F4E0A5A4B464B44074EC75843C1462720450A4D4B464B4E42584F474743440A4F444445584B5E420627206C4B445F43464559060A464F0A464344444B5E4245442720444F4C0A4B4F4B58060A59C70A444F4C0A4B4F4B5845440B";
	String[] messageArray = message.split("(?<=\\G.{2})");

	for (int i = 0; i < messageArray.length; i++) {
	    System.out.print(decrypt(messageArray[i]));

	}
    }

    public static String decrypt(String encryptedLetter) {
	for (int i = 0; i < refEncryptArray.length; i++) {
	    if (encryptedLetter.equals(refEncryptArray[i])) {
		return (referenceArray[i]);
	    } else if ("20".equals(encryptedLetter)) {
		return "";
	    }
	}
	return "";
    }
}
