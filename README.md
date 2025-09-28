# Brawl Stars Draft Assistant

## Overview
This Java program is an **interactive draft assistant** for the game *Brawl Stars*.  
It helps players decide which **brawlers** to ban and pick during the drafting phase by:
- Asking whether you are **first pick** or not.
- Suggesting **initial bans** based on meta.
- Taking input of all banned brawlers.
- Recommending the **best brawler picks** based on matchup bonuses, meta bonuses, and synergy.

The program uses predefined stats for each brawler (e.g., bonuses, counters, and synergy values).

---

## Features
- ✅ Handles both **first pick** and **second pick** scenarios.  
- ✅ Dynamically updates the available brawler pool after bans and picks.  
- ✅ Suggests optimal brawler choices based on computed scores.  
- ✅ Interactive console-based interface.  

---

## Requirements
- Java Development Kit (JDK) 8 or higher

---

## How to Compile and Run
1. Clone or download this repository.  
2. Open a terminal in the project directory.  
3. Compile the program:
   ```bash
   javac Main.java Brawler.java
