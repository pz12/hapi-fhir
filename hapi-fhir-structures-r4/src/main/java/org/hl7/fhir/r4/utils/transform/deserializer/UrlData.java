package org.hl7.fhir.r4.utils.transform.deserializer;

/**
 * Stored ANTLR Url rule parsed data
 *
 * @author Travis Lukach
 * (c) Applicadia LLC.
 */
public class UrlData {
  /**
   * Original string.
   */
  public String CompleteUrl;
  /**
   * Url Authority.
   */
  String Authority = "";
  /**
   * Url Login data . Null if no login
   */
  UrlLogin Login = null;
  /**
   * Url host .Blank if no
   */
  String Host = "";
  /**
   * Url Port.
   */
  int Port = -1;
  /**
   * Url Path.
   */
  public String[] Path = new String[0];
  /**
   * Url Search.
   */
  public UrlSearch[] Search = new UrlSearch[0];

  /**
   * Overload of ToString. Returns complete formatter url.
   *
   * @return string representation of the object.
   */
  public String toString() {
    try {
      return CompleteUrl;
    } catch (RuntimeException __dummyCatchVar0) {
      throw __dummyCatchVar0;
    } catch (Exception __dummyCatchVar0) {
      throw new RuntimeException(__dummyCatchVar0);
    }
  }

  /**
   * Wrapper for a string's compare call.
   *
   * @param a the first string to be compared
   * @param b the second string to be compared
   * @return the result of the comparison
   * @throws Exception if either values for comparison are invalid
   */
  private static int compare(String a, String b) throws Exception {
    return a.compareTo(b);
  }

  /**
   * Compares integers returning -1, 0, or 1 depending on result.
   *
   * @param a first integer to be compared.
   * @param b second integer to be compared.
   * @return the result of the comparison
   * @throws Exception if either values for comparison are invalid
   */
  private static int compare(int a, int b) throws Exception {
    return Integer.compare(a, b);
  }

  /**
   * Wrapper and handler or comparing a UrlSearch array.
   *
   * @param a the first array to be compared.
   * @param b the second array to be compared.
   * @return the result.
   * @throws Exception if either values for comparison are invalid
   */
  private static int compare(UrlSearch[] a, UrlSearch[] b) throws Exception {
    int retVal = a.length - b.length;
    if (retVal != 0) {
      return retVal;
    }
    for (int i = 0; i < a.length; i++) {
      retVal = UrlSearch.compare(a[i], b[i]);
      if (retVal != 0) {
        return retVal;
      }
    }
    return 0;
  }

  /**
   * @param a First array value to be compared
   * @param b Second array value to be compared
   * @return numeric result of the comparison
   * @throws Exception if either values for comparison are invalid
   */
  private static int compare(String[] a, String[] b) throws Exception {
    int retVal = a.length - b.length;
    if (retVal != 0)
      return retVal;

    for (int i = 0; i < a.length; i++) {
      retVal = a[i].compareTo(b[i]);
      if (retVal != 0) {
        return retVal;
      }
    }
    return 0;
  }

  /**
   * Compare this url to another one.
   *
   * @param other used to compare values of this object
   * @return numeric representation of the comparison.
   */
  public int compareTo(UrlData other) throws Exception {
    int retVal;
    retVal = compare(this.Authority, other.Authority);
    if (retVal != 0) {
      return retVal;
    }
    retVal = UrlLogin.compare(this.Login, other.Login);
    if (retVal != 0) {
      return retVal;
    }
    retVal = compare(this.Host, other.Host);
    if (retVal != 0) {
      return retVal;
    }
    retVal = compare(this.Port, other.Port);
    if (retVal != 0) {
      return retVal;
    }
    retVal = compare(this.Path, other.Path);
    if (retVal != 0) {
      return retVal;
    }
    retVal = compare(this.Search, other.Search);
    if (retVal != 0) {
      return retVal;
    }
    return 0;
  }

}
