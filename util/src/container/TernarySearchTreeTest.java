package container;

import static org.junit.Assert.*;

import org.junit.Test;

public class TernarySearchTreeTest extends TernarySearchTree {

	@Test
	public void testInsert() {
		TernarySearchTree t = new TernarySearchTree();
		t.Insert("CCCC");
		t.Insert("AAAA");
		t.Insert("BBBB");
		t.Insert("BBBB BBB");
		t.dump();
	}

	@Test
	public void testSearch() {
		TernarySearchTree t = new TernarySearchTree();
		t.Insert("CCCC");
		t.Insert("AAAA");
		t.Insert("BBBB");
		t.Insert("Johnny");
		t.Insert("Johnny Chang");
		t.Insert("Johnny L Chang");
		t.Insert("Oliver");
		
		assertTrue(t.Search("AAAA"));
		assertFalse(t.Search("AA"));
		assertFalse(t.Search("BBB"));
		assertTrue(t.Search("BBBB"));
		assertTrue(t.Search("Oliver"));
		assertTrue(t.Search("Johnny"));
		assertFalse(t.Search("Oliv"));
		assertFalse(t.Search("Johnnyyy"));
		assertTrue(t.Search("Johnny Chang"));
		assertFalse(t.Search("Johnny hang"));
		assertTrue(t.Search("Johnny L Chang"));
		assertFalse(t.Search("Johnny LChang"));
		assertFalse(t.Search("JohnnyChan"));
		t.Sort();
	}
	
	@Test
	public void testPrefixSearch() {
		TernarySearchTree t = new TernarySearchTree();
		t.Insert("Johnny");
		t.Insert("Johnny Cha");
		t.Insert("Johnny Chen");
		t.Insert("Johnny Ching");
		t.Insert("Johnny Chonggg");
		t.Insert("Oliver");
		t.Insert("Oliver Lin");
		t.PrefixSearch("Oliver");
		t.PrefixSearch("Johnny");
	}

	@Test
	public void testDelete() {
		//fail("Not yet implemented");
	}

}
