# Vibranium Madness

A Minecraft Fabric mod that adds the powerful metal vibranium to your world! Experience the strength and durability of this legendary material through new ores, ingots, blocks, and tools.

![Minecraft Version](https://img.shields.io/badge/Minecraft-1.21.8-brightgreen)
![Fabric API](https://img.shields.io/badge/Fabric%20API-0.130.0-blue)
![Mod Version](https://img.shields.io/badge/Version-1.0.0-orange)
![License](https://img.shields.io/badge/License-CC0--1.0-lightgrey)

## 📖 Overview

Vibranium Madness introduces the iconic vibranium material into Minecraft, bringing you incredibly durable tools and building materials. Whether you're mining deep underground or building massive structures, vibranium will revolutionize your gameplay experience.

## ✨ Features

### 🧱 Blocks
- **Raw Vibranium Block**: A storage block for raw vibranium with exceptional durability
  - Hardness: 50.0 (compared to obsidian's 50.0)
  - Blast Resistance: 1200.0 (compared to obsidian's 1200.0)
  - Requires proper tools to mine
  - Found in the Building Blocks creative tab

### 🔧 Items
- **Vibranium Ingot**: The refined form of vibranium, used for crafting advanced tools
- **Raw Vibranium**: The unprocessed vibranium material
- **Vibranium Pickaxe**: An incredibly powerful mining tool
  - Durability: 2031 uses (compared to diamond's 1561)
  - Mining Speed: 36.0 (compared to diamond's 8.0)
  - Attack Damage: 16.0 (compared to diamond's 5.0)
  - Enchantability: 19

### 🛒 Trading
- **Toolsmith Villager Trades**: 
  - Level 1: Trade 10 emeralds for 1 raw vibranium
  - Limited stock: 7 trades per villager
  - Restocks 15 times
  - Provides 2 experience points per trade

## 🔧 Installation

### Prerequisites
- Minecraft 1.21.8
- Fabric Loader 0.16.14 or higher
- Fabric API 0.130.0 or higher
- Java 21 or higher

### Steps
1. Download and install [Fabric Loader](https://fabricmc.net/use/)
2. Download [Fabric API](https://modrinth.com/mod/fabric-api) for Minecraft 1.21.8
3. Download the latest release of Vibranium Madness
4. Place both the Fabric API and Vibranium Madness `.jar` files in your `mods` folder
5. Launch Minecraft with the Fabric profile

## 🎮 How to Use

### Getting Started
1. **Find a Toolsmith Villager**: Trade emeralds for raw vibranium to get started
2. **Smelt Raw Vibranium**: Process raw vibranium into vibranium ingots (smelting recipes to be added)
3. **Craft Tools**: Use vibranium ingots to create powerful tools
4. **Build with Vibranium**: Create decorative and functional blocks with raw vibranium blocks

### Tips
- Vibranium tools have exceptional durability and mining speed
- Raw vibranium blocks make excellent blast-resistant building materials
- Stock up on emeralds to trade with toolsmiths for raw vibranium

## 🛠️ For Developers

### Project Structure
```
src/main/java/net/asmahdi/vibraniummadness/
├── VibraniumMadness.java          # Main mod class
├── blocks/
│   └── ModBlocks.java             # Block registration
├── item/
│   └── ModItems.java              # Item registration
├── toolmaterials/
│   └── ModToolMaterials.java      # Tool material definitions
└── trades/
    └── ModTrades.java             # Villager trade registration
```

### Building from Source
```bash
git clone <repository-url>
cd vibranium-madness-template-1.21.8
./gradlew build
```

### Development Setup
1. Clone the repository
2. Import into your IDE (IntelliJ IDEA recommended)
3. Run `./gradlew genEclipseRuns` or `./gradlew genIntellijRuns`
4. Use the generated run configurations to test the mod

## 📋 Planned Features

- [ ] Vibranium ore world generation
- [ ] Complete tool set (sword, axe, shovel, hoe)
- [ ] Vibranium armor set
- [ ] Advanced vibranium blocks and decorative variants
- [ ] Smelting and crafting recipes
- [ ] Loot table integration
- [ ] Enhanced villager trading options

## 🤝 Contributing

Contributions are welcome! Please feel free to submit pull requests or open issues for bugs and feature requests.

### Guidelines
- Follow the existing code style and structure
- Test your changes thoroughly
- Update documentation as needed
- Ensure compatibility with Minecraft 1.21.8 and Fabric API

## 📜 License

This mod is licensed under [CC0-1.0](LICENSE). You are free to use, modify, and distribute this mod as you see fit.

## 🙏 Acknowledgments

- Built with [Fabric](https://fabricmc.net/)
- Inspired by Marvel's vibranium
- Thanks to the Minecraft modding community

## 📞 Support

If you encounter any issues or have questions:
- Open an issue on GitHub
- Check existing issues for solutions
- Ensure you're using the correct versions of Minecraft, Fabric Loader, and Fabric API

---

*Made with ❤️ for the Minecraft community*
