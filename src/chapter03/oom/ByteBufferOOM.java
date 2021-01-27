package chapter03.oom;


import sun.nio.ch.DirectBuffer;

import java.nio.ByteBuffer;

public class ByteBufferOOM {

	//-XX:MaxDirectMemorySize=256m
	public static void main(String []args) {
		//ByteBuffer.allocateDirect(257 * 1024 * 1024);
		Object o = ByteBuffer.allocateDirect(256 * 1024 * 1024);
	//	((DirectBuffer) o).cleaner().clean();
		ByteBuffer.allocateDirect(1024 * 1024);
	}
}
