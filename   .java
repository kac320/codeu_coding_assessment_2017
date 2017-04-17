// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.codeu.codingchallenge;

import java.util.Collection;

final class MyJSON implements JSON {
    
   private ArrayList<E> list;
   public JSON () {
       list = new ArrayList<E>();
   }

  /**
   * gets object matching string
   * @return object
   */
  public JSON getObject(String name) {
    for (Object a:list) {
        if (a.toString().equals(name)) {
            return a;
        }
    }
    else {
        return null;
    }
  }

  /**
   * sets value in list
   * @return new JSON
   */
  public JSON setObject(String name, JSON value) {
      this.list = name;
      return this;
  }

  /**
   * @return string name if name is present in list
   */
  public String getString(String name) {
     if(this.getObject(name) !null) {
         return name;
     }
     else {
         return null;
     }
  }

  /**
   * sets old string to new string
   * @return new JSON w/ new value
   */
  public JSON setString(String name, String value) {
    this.list.setObject(value, this.getObject(name));
    return this;
  }

  /**
   * copies objects into collection
   */
  public void getObjects(Collection<String> names) {
      for (Object a:list) {
        names.add(a);
      }
  }

  /**
   * copies names of objects into collection
   */
  public void getStrings(Collection<String> names) {
      for (Object a:list) {
          names.add(a.toString());
        }
  }
}
