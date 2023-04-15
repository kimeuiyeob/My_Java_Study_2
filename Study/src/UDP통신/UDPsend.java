package UDP통신;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPsend {

	public static void main(String[] args) {

		System.out.println("<클라이언트A> - Text");

		// 1.DatagramSocker 생성 (binding 정보 = 10000)
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(10000);
		} catch (SocketException e) {
			;
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("전송할 TEXT 입력해주세요.");
		String text = sc.nextLine();

		// 2.전송데이터 생성 + DatagramPacket 생성 (수신지 주소 = "192.168.56.1", 20000)
		byte[] sendData = text.getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,
				new InetSocketAddress("192.168.56.1", 20000));

		// 3.데이터그램패킷 전송
		try {
			System.out.println("송신데이터 : " + new String(sendPacket.getData()).trim());
			// send()데이터 보낼때 사용
			ds.send(sendPacket);
		} catch (IOException e) {
			;
		}

		// 4.데이터그램 패킷 수신
		// 송신한 데이터를 받아야하니까 큰 빈상자를 하나 생성하고 받는다.
		byte[] receivedData = new byte[65508];
		DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);

		try {
			// receive()데이터 받을때 사용
			ds.receive(receivedPacket);
		} catch (IOException e) {
			;
		}

		System.out.println("수신데이터 : " + new String(receivedPacket.getData()).trim());

	}

}
