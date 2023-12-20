package com.nt.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Naukri;
import com.nt.repository.INaukriRepository;
@Service
public class NaukriServiceImpl implements INaukriService {
	@Autowired
	private INaukriRepository repo;
	@Override
	public String registerSeeker(String name, String Address, Long number, String resume, String image)throws Exception {
			File file = new File(resume);
			Reader reader = new FileReader(file);
			char[] rData = new char[(int)file.length()];
			reader.read(rData);
			InputStream ls = new FileInputStream(image);
			byte[] iData = new byte[ls.available()];
			iData = ls.readAllBytes();
			Naukri seeker = new Naukri(name, Address, number, rData, iData);
			Naukri n = repo.save(seeker);
		return n!=null?"Job Seeker registered to Naukri.com":"Job Seeker not registered to Naukri.com";
	}
	@Override
	public String findJobSeeker(Integer id) throws Exception {
		Optional<Naukri> js = repo.findById(id);
		if(js.isEmpty())
			return "No Job Seeker found of having id: "+id;
		else {
			OutputStream os = new FileOutputStream("image.jpeg");
			os.write(js.get().getJSImage());
			os.flush();
			Writer w = new FileWriter("resume.txt");
			w.write(js.get().getJSResume());
			w.flush(); 
			os.close();
			w.close();
			
			return js.get().getJSId()+" "+js.get().getJSName()+" "+js.get().getJSAddress()+" "+js.get().getJSNumber()+"\n Image and resume saved";
		}
		
	}

}
