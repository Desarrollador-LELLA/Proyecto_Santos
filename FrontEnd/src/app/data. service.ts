import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";

@Injectable()
export class DataService {
    constructor (private http: HttpClient) {}

    getAll(): Observable<any>{
        return this.http.get<any>('/login')
    }
}