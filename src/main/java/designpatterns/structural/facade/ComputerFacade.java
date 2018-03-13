package designpatterns.structural.facade;

public class ComputerFacade {
	
	private RAM ram;
	private CPU cpu;

	public ComputerFacade() {
		ram = new RAM();
		cpu = new CPU();
	}

	public void startComputer() {
		cpu.loadCPU();
		ram.loadRAM();
	}

}