﻿using System;
using message;
using RedStone.Net;

namespace RedStone
{
	public class HallProxy : ProxyBase
	{
		private PlayerData m_mainPlayerData = new PlayerData();
		public PlayerData mainPlayerData { get { return m_mainPlayerData; } }

		public HallProxy()
		{
			netType = NetType.Hall;
		}

		public override void OnInit()
		{
			base.OnInit();
		}

		public override void OnDestroy()
		{
			base.OnDestroy();
		}

		public void AssignRoom()
		{
			AssignRoomRequest msg = new AssignRoomRequest();
			network.SendMessage<AssignRoomRequest, AssignRoomReply>(msg,
			(reply) =>
			{
				SendEvent(Event.Gomuku.AssignRoomReply);
				GetProxy<GomukuProxy>().ConnectToBattleServer(reply.address, reply.roomId);
			});
		}

		public void ConnectToGameServer(string address)
		{
			ServerManager.instance.Get(NetType.Hall).onConnected = (obj) =>
			{

			};

			ServerManager.instance.Connect(NetType.Hall, address);
		}

		public void Login(string uuid)
		{
			LoginRequest msg = new LoginRequest();
			msg.deviceUID = uuid;
			network.SendMessage<LoginRequest, LoginReply>
			(msg, (reply) =>
			{
				m_mainPlayerData.SetData(reply);
			});
		}
	}
}
