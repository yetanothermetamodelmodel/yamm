/**
 * Copyright (C) 2019 yamm.dev, Ralf Buschermöhle
 * 	
 * YAMM is made available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * YAMM makes use of JScience - Java(TM) Tools and Libraries for the 
 * Advancement of Sciences: Copyright (C) 2006 - JScience (http://jscience.org/) 
 * All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * 
 * see LICENSE.txt
 * 
 */
package dev.yamm.communication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class MulServer
{

	private static int remotePort = 2048;
	private ServerSocket server;

	/**
	 * This method is for all incoming object input streams
	 * @param client client that sends the object.
	 * @return gives the command back which the client sent
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static Command handleInConnection(Socket client ) throws IOException, ClassNotFoundException {
		Command command = null;

		ObjectInputStream in  = new ObjectInputStream( client.getInputStream() );

		command = (Command) in.readObject();
		return command;
	}

	/**
	 * This method is for all outgoing output streams
	 * @param client the client which will receive the command
	 * @param command the command which the client receive
	 * @throws IOException
	 */
	public static void handleOutConnection( Socket client, Command command ) throws IOException {

		ObjectOutputStream out  = new ObjectOutputStream( client.getOutputStream() );
		out.writeObject(command);
	}


	public void startServer() {
		server = null;
		try
		{
			server = new ServerSocket(remotePort);  
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Server an!");
		while ( true )
		{
			try {
				new ServerThread(server.accept()).start();
			} catch (IOException e) {
//				e.printStackTrace();
				break;
			}
		}
	}
	
	public void stopServer() {
		try {
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
