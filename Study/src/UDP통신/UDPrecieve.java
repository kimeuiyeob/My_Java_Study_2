package UDP통신;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPrecieve {
	
	public static void main(String[] args) {

		System.out.println("<클라이언트B> - Text");

		// 1.DatagramSocket 생성 (binding 20000)
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(20000);
		} catch (SocketException e) {
			;
		}

		// 2. DatagramPacket 수신
		byte[] receivedData = new byte[66508];
		DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);

		try {
			ds.receive(receivedPacket);
		} catch (IOException e) {
			;
		}

		// 3.전송 데이터 생성 + DatagramPacket 생성(수신지 주소 = 수신 패킷의 원격지 정보 추출)
		System.out.println("수신데이터 : " + new String(receivedPacket.getData()).trim());

		byte[] sendData = "반갑습니다".getBytes();
		// receivedPacket.getSocketAddress()은 send에서 보낸 원격 주소를 추출히여 그주소로 다시 답장을 보내는거다.
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivedPacket.getSocketAddress());

		// 4. 데이터그램패킷 전송
		try {
			System.out.println("송신데이터 : " + new String(sendPacket.getData()).trim());
		} catch (Exception e) {
			;
		}
	}

}
