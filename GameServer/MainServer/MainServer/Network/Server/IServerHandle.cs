﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RedStone.Net
{
	public interface IServerHandle
	{
		void OnOpen(long sessionId);
		void OnMessage(byte[] data);
		void OnClose(string reason);
		void OnError(string reason);
		void Send(NetType type, byte[] data);
	}
}
