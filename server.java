import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class server implements Runnable {
	private static final int PORT = 60535;
	private static String battlerName = null;
	private static String battlerType = null;
	private static String serverName = null;
	private static String serverType = null;
	private static final String BADHANDSHAKE = "Error: Bad Handshake";
	private static String attackName = null;
	private static ServerSocket servSocket = null;
	private static Socket socket = null;
	private static int serverHP = 0;
	private static int battlerHP = 0;
	private static int attackNumber = 0;
	private static Random randoNumb = null;
	private static File fileServer = null; 
	private static ServerSocket serverSock;
	
	
	//initalizes variables on server side
	public server (String serverUsername) throws Exception
	{
		String fileName = "serverFile" ;
		File fileServer = new File(fileName);
		battlerName = stringRead(fileName).substring();
		Random randoNumb = new Random();
		Scanner servScanner = new Scanner(System.in);
		
		System.out.println("Set server name");
		server.setServerName(servScanner.nextLine());
		System.out.println("Binding to port " + PORT);
		ServerSocket serverSock = new ServerSocket(PORT);
		Socket socket = new Socket();
		socket = serverSock.accept();
		
		
		
		System.out.println("Initializing server connection name: " + server.getServerName());
		
		
		
		
	}
	public static String stringRead(String fileName) {
		String rtnData = "";
		try {
			BufferedReader in = new BufferedReader(new FileReader(fileName));
			String data;
			data = in.readLine();
			rtnData = data;
			in.close();

		} catch (Exception e) {
			PrintStream s = null;
			e.printStackTrace(s);

		}
		return rtnData;

	}

	public static String getBattlerName() {
		return battlerName;
	}
	public static void setBattlerName(String battlerName) {
		server.battlerName = battlerName;
	}
	public static String getBattlerType() {
		return battlerType;
	}
	public static void setBattlerType(String battlerType) {
		server.battlerType = battlerType;
	}
	public static String getServerName() {
		return serverName;
	}
	public static void setServerName(String serverName) {
		server.serverName = serverName;
	}
	public static String getServerType() {
		return serverType;
	}
	public static void setServerType(String serverType) {
		server.serverType = serverType;
	}
	public static String getAttackName() {
		return attackName;
	}
	public static void setAttackName(String attackName) {
		server.attackName = attackName;
	}
	public static ServerSocket getServSocket() {
		return servSocket;
	}
	public static void setServSocket(ServerSocket servSocket) {
		server.servSocket = servSocket;
	}
	public static Socket getSocket() {
		return socket;
	}
	public static void setSocket(Socket socket) {
		server.socket = socket;
	}
	public static int getServerHP() {
		return serverHP;
	}
	public static void setServerHP(int serverHP) {
		server.serverHP = serverHP;
	}
	public static int getBattlerHP() {
		return battlerHP;
	}
	public static void setBattlerHP(int battlerHP) {
		server.battlerHP = battlerHP;
	}
	public static int getAttackNumber() {
		return attackNumber;
	}
	public static void setAttackNumber(int attackNumber) {
		server.attackNumber = attackNumber;
	}
	public static Random getRandoNumb() {
		return randoNumb;
	}
	public static void setRandoNumb(Random randoNumb) {
		server.randoNumb = randoNumb;
	}
	public static File getFileServer() {
		return fileServer;
	}
	public static void setFileServer(File fileServer) {
		server.fileServer = fileServer;
	}
	public static int getPort() {
		return PORT;
	}
	public static String getBadhandshake() {
		return BADHANDSHAKE;
	}
	
	
	
	
	
	@Override public void run() {
		// TODO Auto-generated method stub

	}

}
