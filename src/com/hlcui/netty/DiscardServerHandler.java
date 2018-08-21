package com.hlcui.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

@SuppressWarnings("deprecation")
public class DiscardServerHandler extends ChannelInboundHandlerAdapter { // (1)

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) { // (2)
		ctx.write(msg); // (1)
		ctx.flush(); // (2)
		
		
//		ByteBuf in = (ByteBuf) msg;
//		try {
//			System.out.println(in.toString(io.netty.util.CharsetUtil.US_ASCII));
//			ctx.writeAndFlush(msg);
//			ctx.flush();
//		} finally {
//			ReferenceCountUtil.release(msg); // (2)
//		}
//		System.out.println("Yes, A new client in = " + ctx.name());
//		ctx.writeAndFlush(msg);
//		ctx.flush();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) { // (4)
		cause.printStackTrace();
		ctx.close();
	}
}
