package problems.hard.lruCache;

import org.junit.Test;
import problems.hard.LRUCache.LRUCache;

/**
 * @author koontz
 */
public class LRUCacheTest {

	@Test
	public void happyPath() {

		int cache_size = 5;
		LRUCache cache = new LRUCache(cache_size);

		cache.set(1, 1);
		System.out.println(cache.getCacheAsString());
		cache.set(2, 2);
		System.out.println(cache.getCacheAsString());
		cache.set(3, 3);
		System.out.println(cache.getCacheAsString());
		cache.get(1);
		System.out.println(cache.getCacheAsString());
		cache.set(4, 4);
		System.out.println(cache.getCacheAsString());
		cache.get(2);
		System.out.println(cache.getCacheAsString());
		cache.set(5, 5);
		System.out.println(cache.getCacheAsString());
		cache.get(5);
		System.out.println(cache.getCacheAsString());
		cache.set(6, 6);
		System.out.println(cache.getCacheAsString());
		cache.get(1);
		System.out.println(cache.getCacheAsString());
		cache.get(3);
		System.out.println(cache.getCacheAsString());
	}

}
