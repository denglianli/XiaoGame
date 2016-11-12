package org.redstone.server;

import java.nio.ByteBuffer;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint.Async;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.redstone.protobuf.msg.CardProto.Card;

import com.google.protobuf.InvalidProtocolBufferException;

@ServerEndpoint("/test")
public class TestServlet {
	
	Session session;
	Async remote;
	@OnOpen
	public void onOpen(Session s){
		session = s;
		remote = session.getAsyncRemote();
		System.out.println(session.getId() + "����");
	}
	
	@OnClose
	public void onClose(){
		System.out.println(session.getId() + "�Ͽ�");
	}
	
	@OnMessage
	public void onMessage(String message){
		
	}
	
	@OnMessage
	public void receiveMessage(ByteBuffer reciveBuff) {
		
		try {
			Card c = Card.parseFrom(reciveBuff.array());
			System.out.println(c.getColor());
			System.out.println(c.getMemo());
			System.out.println(c.getNum());
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
		
		session.getAsyncRemote().sendBinary(reciveBuff);
	}
}
