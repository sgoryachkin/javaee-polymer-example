package com.sego.example.web.service.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class DtoUtils {

	public static int hashSumm(Serializable o) {
		byte[] bytes = toByteArray(o);
		return Arrays.hashCode(bytes);
	}

	public static byte[] toByteArray(Serializable o) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
			oos.writeObject(o);
			return bos.toByteArray();
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}

}
