package com.brugier.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.brugier.SerializableSingleton;

public class SerializableSingletonTest {

	@Test
	public void checkObjectEquals() throws Exception {
		SerializableSingleton firstInstance = SerializableSingleton.getInstance();
		SerializableSingleton secondInstance = null;

		try (FileOutputStream fos = new FileOutputStream("./SingletonSimpleLazy.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(firstInstance);
		}

		try (FileInputStream fis = new FileInputStream("./SingletonSimpleLazy.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			secondInstance = (SerializableSingleton) ois.readObject();
		}
		
		Files.deleteIfExists(Paths.get("./SingletonSimpleLazy.ser"));
		
		assertEquals(firstInstance, secondInstance);
	}
}
